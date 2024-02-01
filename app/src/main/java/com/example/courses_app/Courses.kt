package com.example.courses_app

import androidx.annotation.DrawableRes

data class Courses(
    val rating: Float,
    val title: String,
    @DrawableRes val thumbnail: Int,
    val body: String,
)

val course1 = Courses(
    4.5f,
    "The Complete Android 14 Developer Course - Java & Kotlin",
    R.drawable.course1,
    "· Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n" +
            "\n" +
            "· Download, install and configure the necessary (free) software.\n" +
            "\n" +
            "· Create your first app.\n" +
            "\n" +
            "· Build a range of apps demonstrating key aspects of the Android framework.\n" +
            "\n" +
            "· Test your apps on emulators or a real Android phone or tablet.\n" +
            "\n" +
            "· You’ll learn Java programming because Android app development requires knowledge of Java. Included are Java tutorial videos that will get you up to speed fast.\n" +
            "\n" +
            "· Ensure your apps work with current and older Android versions on phones and tablets."
)

val course2 = Courses(
    4.3f,
    "Mastering Android App Development with Kotlin [XML +COMPOSE]",
    R.drawable.course1,
    "Over 50 hours of high quality & high definition 1080p video content\n" +
            "\n" +
            "The complete code with step by step guides (in the code itself). So either you follow along in the video, or you get right into the action in Android Studio yourself.\n" +
            "\n" +
            "Loads of exercises that make sure, that the knowledge really sticks.\n" +
            "\n" +
            "The best Android 13 app development course money can buy."
)

val course3 = Courses(
    4f,
    "Mastering Design Patterns - Become a Professional Developer\n",
    R.drawable.course1,
    "Master the Structural Design Patterns (Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy)\n" +
            "Master the Creational Design Patterns (Factory, Abstract Factory, Builder, Prototype, Singleton)\n" +
            "Master the Behavioural Design Patterns (Memento, Chain of Responsibility, Command, Iterator, Mediator, Observer, Template, Visitor, Strategy)"
)

val course4 = Courses(
    4.2f,
    "Mastering Jetpack Compose: Building Dynamic User Interfaces",
    R.drawable.course1,
    "What’s Jetpack Compose and Its Advantages over the Imperative way of building Android Apps\n" +
            "Kotlin Programming basics, Intermediate and advanced concepts (Optional - you can skip if you need to)\n" +
            "Master how to customize UI elements in Compose\n" +
            "Understand how MutableState, and Flow work with Composable Functions"

)

val course5 = Courses(
    4.2f,
    "Mastering Jetpack Compose: Building Dynamic User Interfaces",
    R.drawable.course1,
    "What’s Jetpack Compose and Its Advantages over the Imperative way of building Android Apps\n" +
            "Kotlin Programming basics, Intermediate and advanced concepts (Optional - you can skip if you need to)\n" +
            "Master how to customize UI elements in Compose\n" +
            "Understand how MutableState, and Flow work with Composable Functions"

)

val course6 = Courses(
    4.2f,
    "Mastering Jetpack Compose: Building Dynamic User Interfaces",
    R.drawable.course1,
    "What’s Jetpack Compose and Its Advantages over the Imperative way of building Android Apps\n" +
            "Kotlin Programming basics, Intermediate and advanced concepts (Optional - you can skip if you need to)\n" +
            "Master how to customize UI elements in Compose\n" +
            "Understand how MutableState, and Flow work with Composable Functions"

)

val allCourses = listOf(
    course1,
    course2,
    course3,
    course4,
    course5,
    course6,
)