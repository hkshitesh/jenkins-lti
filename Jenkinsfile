pipeline {
		agent any
		tools {
		maven 'MAVEN_HOME'
		}
		stages {
				stage('Stage 1: Clean Stage')
				{
				 steps {
				 	sh 'mvn clean'
				 }
				 }
				stage('Stage 2: Build Stage')
				{
				 steps {
				 	sh 'mvn install'
				 }
				 }
				 stage('Stage 3: Build Complete')
				{
				 steps {
				 	echo 'Build complete'
				 }
				 }
	 }
	}