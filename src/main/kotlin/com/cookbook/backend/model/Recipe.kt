package com.cookbook.backend.model

import com.fasterxml.jackson.annotation.JsonManagedReference
import com.vladmihalcea.hibernate.type.array.StringArrayType
import org.hibernate.annotations.Type
import org.hibernate.annotations.TypeDef
import org.hibernate.annotations.TypeDefs
import javax.persistence.*


@Entity
@Table(name = "recipes")
@TypeDefs(TypeDef(name = "string-array", typeClass = StringArrayType::class))
class Recipe(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,

    val name: String? = null,

    val category: String? = null,

    val serves: String? = null,

    @Column(name = "rating")
    val rating: Int = 0,

    @Column(name = "recipe_image_url")
    val recipeImageUrl: String? = null,

    @Column(name = "prep_time")
    val prepTime: String = "0",

    @Column(name = "cook_time")
    val cookTime: String = "0",

    @Column(name = "total_time")
    val totalTime: String = "0",

    @OrderColumn
    @Type(type = "string-array")
    val ingredients: Array<String> = arrayOf(""),

    @OrderColumn
    @Type(type = "string-array")
    val instructions: Array<String> = arrayOf(""),

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonManagedReference
    val user: User? = null
)