package com.github.samarchandra.intellijplugintemplate.services

import com.github.samarchandra.intellijplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
