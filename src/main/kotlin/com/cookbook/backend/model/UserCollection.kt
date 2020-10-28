package com.cookbook.backend.model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "collections")

class UserCollection(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonManagedReference
    val user: User? = null,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    @JsonManagedReference
    val recipe: Recipe? = null
)