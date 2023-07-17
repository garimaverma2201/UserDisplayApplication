package com.app.userdisplayapp.models

data class UserListResponse(val perPage: Int = 0,
                            val total: Int = 0,
                            val data: List<DataItem>?,
                            val page: Int = 0,
                            val totalPages: Int = 0,
                            val support: Support)