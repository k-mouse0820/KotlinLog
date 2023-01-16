package jp.techacademy.koji.tanno.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

fun formatMyTag(): String {
    return "[" + MY_TAG + "]"
}

const val MY_TAG = "kotlintest"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("Koji",47,"旅行")
        human.say()
        human.think()

        /*
        val dog = Dog("ポチ",3)
        dog.move()
        */

        /*
        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = BigDog("ヨーゼフ", 15)
        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")
        */


        /*
        val t = total(50, 1000)
        Log.d("kotlintest", t.toString())

        val x = total(1, 2)
        Log.d("kotlintest", x.toString())

        val y = total(10, 100)
        Log.d("kotlintest", y.toString())

        Log.d("kotlintest", "ログへの出力テスト")

        // 整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        // numに50を代入する
        // 変数や定数に .toString() と記述する方法もある
        num = 50
        Log.d("kotlintest",num.toString())

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest","10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))

        num = 55

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }

        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の " + i + "回目")
        }

        num = 1

        while (num < 6) {
            Log.d("kotlintest", "while文の " + num + "回目")
            num++
        }

        for ( i in 1..3) {
            Log.d("kotlintest", "..演算子の" + i + "回目")
        }

        for ( i in 6 downTo 0 step 2) {
            Log.d("kotlintest", "downTo関数の" + i + "回目")
        }

        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        val numA = 100
        val numB = 0
        var ans = 0

        try {
            ans = numA / numB
        } catch (e : Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }

        */
    }

    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for (i in first..last) {
            sum += i
        }

        return sum
    }

}