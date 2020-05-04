

fun main(args: Array<String>) {
    val list: List<Int> = listOf(1,2,3,4,5);
    // list.add(6); // 컴파일 오류
    val newList = list.plus(6);
    println(list)
    println(newList)
}
