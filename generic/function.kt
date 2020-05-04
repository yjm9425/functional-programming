
fun <T> head(list: List<T>): T{
    if(list.isEmpty()) {
        throw NoSuchElementException()
    }
    return list[0]
}