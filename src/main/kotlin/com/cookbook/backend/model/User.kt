package com.cookbook.backend.model


import javax.persistence.*


@Entity
@Table(name = "users")

class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    val username: String? = null,

    val name: String? = null,

    @Column(name = "profile_image_url")
    val profileImageUrl: String? = null
)