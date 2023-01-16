package jp.techacademy.koji.tanno.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {

    constructor(name: String, age: Int): super(name, age) {
    }
    // メソッド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }

}