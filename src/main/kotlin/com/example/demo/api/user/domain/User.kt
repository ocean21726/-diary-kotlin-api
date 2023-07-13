package com.example.demo.api.user.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity

@Table(name = "SPRING_DIARY_USER")
data class User(
    @Id
    @Column(name = "user_idx")
    var userIdx: Int = 0,

    @Column(name = "user_id")
    var userId: String = "",
    @Column(name = "user_nick")
    var userNick: String = "",
    @Column(name = "user_password")
    var userPassword: String = "",
    @Column(name = "join_date")
    var joinDate: LocalDateTime = LocalDateTime.now(),
)