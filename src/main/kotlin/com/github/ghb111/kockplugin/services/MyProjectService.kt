package com.github.ghb111.kockplugin.services

import com.intellij.openapi.project.Project
import com.github.ghb111.kockplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
