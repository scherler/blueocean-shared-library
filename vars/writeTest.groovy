import groovy.xml.MarkupBuilder

def call() {
    def stringWriter = new StringWriter()
    def testResultBuilder = new MarkupBuilder(stringWriter)
    testResultBuilder.testsuites {
        //testsuite(name: 'JUnitXmlReporter')
    }
    String xml = stringWriter.toString()
println xml
    return xml
}
