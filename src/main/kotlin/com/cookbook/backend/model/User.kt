package com.cookbook.backend.model


import javax.persistence.*


@Entity
@Table(name = "users")

class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, insertable = false, updatable = false)
    var userId: Long? = null,
    val username: String? = null,
    val name: String? = null,
    val profileImageUrl: String? = null,
    val collection: Array<Long> = arrayOf()
) {
    override fun toString(): String {
        return "User(userId=$userId, username=$username, name=$name, profileImageUrl=$profileImageUrl, collection=${collection.contentToString()})"
    }
}