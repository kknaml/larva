package utility


import org.gradle.api.Project
import java.io.File

fun Project.resolve(sub: String): String {
    return File(projectDir, sub).absolutePath
}