package com.github.peterphan.testplugin.services

import com.intellij.openapi.project.Project
import com.github.peterphan.testplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
