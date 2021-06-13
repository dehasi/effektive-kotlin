package item9

import java.io.BufferedReader
import java.io.FileReader

fun countCharactersInFile(path: String) {
    val reader = BufferedReader(FileReader(path))
    reader.use { reader.lineSequence().sumBy { it.length } }
}

fun countCharactersInFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        reader.lineSequence().sumBy { it.length }
    }
}

fun countCharactersInFile3(path: String) {
    FileReader(path).useLines { lines ->
        lines.sumBy { it.length }
    }
}

fun main() {
    print(countCharactersInFile3("./Script.kt"))
}
