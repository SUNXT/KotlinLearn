package com.sun.learn

class Test1 {

    // val 类似java中的final，不能修改
    private val TAG = "Test1"

    // var 可重新赋值变量
    var num1: Int  = 1 // 立即赋值
    var num2 = 1 // 自动推导出‘int’
    // 定义变量的时候就得初始化赋值
    // var a 这样写是错的
    // var a: Int 这样写也是错的

    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            var test1 = Test1()
            test1.hello("Tom")
            println("1 + 2 = ${test1.sum1(1, 2)}")
            println("1 + 2 = ${test1.sum2(1, 2)}")
        }
    }

    /**
     * 直接返回运算结果
     */
    private fun sum1(a: Int, b: Int) = a + b

    /**
     * 定义了返回类型 Int
     */
    fun sum2(a: Int, b: Int) : Int{
        return a + b
    }

    /**
     * 没有返回类型，类似java void
     */
    fun hello(name: String){
        // 字符串模板
        // 模板中的简单名称
        println("hello $name")
        // 模板中的任意表达式
        println("1 + 2 = ${sum1(1, 2)}")
    }

    /**
     * 条件表达式
     */
    fun maxOf(a: Int, b: Int): Int{
        if (a > b){
            return a
        }else{
            return b
        }
    }

    /**
     * 使用if作为表达式
     */
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b

    /**
     * 使用可空值及 null 检测
     * 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
     */
    fun parseInt(str: String): Int?{
        return str.toIntOrNull()
    }

    /**
     * 使用类型检测及自动类型转换
     * is 运算符检测一个表达式是否某类型的一个实例，如果检测为某类型，那在检测分支可以直接当作该类型使用，无需显示转换
     */
    fun getStringLength(obj: Any): Int?{
        if (obj is String){
            return obj.length
        }
        // obj 为Any类型，返回null
        return null
    }

    fun getStringLength1(obj: Any): Int?{
        // 判断，如果不是String，则返回
        if (obj !is String) return null
        // 因为通过了判断，说明是String，所以不用做类型转换
        return obj.length
    }

    fun getStringLength2(obj: Any): Int?{
        // 判断类型后，在if中使用&&可以直接用判定的类型
        if (obj is String && obj.length > 0) return obj.length
        return null
    }

    /**
     * 使用for循环
     */
    fun testFor(){

    }
}