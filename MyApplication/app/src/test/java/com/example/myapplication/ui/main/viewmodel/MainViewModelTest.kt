package com.example.myapplication.ui.main.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.example.myapplication.data.api.ApiHelper
import com.example.myapplication.data.model.User
import com.example.myapplication.utils.Resource
import com.example.myapplication.utils.TestCoroutineRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {
    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @Mock
    private lateinit var apiHelper: ApiHelper

    @Mock
    private lateinit var apiUsersObserver: Observer<Resource<List<User>>>

    @Before
    fun setUp() {
       //
    }

    @Test
    fun return_success_when_server_succeed() {
        testCoroutineRule.runBlockingTest {
            doReturn(emptyList<User>())
                .`when`(apiHelper)
                .getUsers()
            val viewModel = MainViewModel(apiHelper)
            viewModel.getUsers().observeForever(apiUsersObserver)
            verify(apiHelper).getUsers()
            verify(apiUsersObserver).onChanged(Resource.success(emptyList()))
            viewModel.getUsers().removeObserver(apiUsersObserver)
        }
    }

    @Test
    fun return_error_when_server_fail() {
        testCoroutineRule.runBlockingTest {
            val errorMessage = "Error SERVER FAIL"
            doThrow(RuntimeException(errorMessage))
                .`when`(apiHelper)
                .getUsers()
            val viewModel = MainViewModel(apiHelper)
            viewModel.getUsers().observeForever(apiUsersObserver)
            verify(apiHelper).getUsers()
            verify(apiUsersObserver).onChanged(Resource.error(errorMessage.toString(), null))
            viewModel.getUsers().removeObserver(apiUsersObserver)
        }
    }
}
