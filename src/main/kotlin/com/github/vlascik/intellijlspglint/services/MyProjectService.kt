package com.github.vlascik.intellijlspglint.services

import com.github.vlascik.intellijlspglint.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
