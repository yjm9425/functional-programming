
// Java 1.7
Properties property = new Properties();

try (FileInputStream stream = new FileInputStrea("config.info")) {
    property.load(stream)
}

// Kotlin
val property = Properties();
FileInputStream("config.info").use {
    property.load(it)
}