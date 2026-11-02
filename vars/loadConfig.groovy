import groovy.json.JsonSlurper

def call(String fileName = 'config.json') {
    def fileContent = libraryResource(fileName)
    return new JsonSlurper().parseText(fileContent)
}
