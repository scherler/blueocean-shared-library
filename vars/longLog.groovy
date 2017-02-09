def call(max, oneResponse = true) {
    def output  = 'HERE goes NOTHING\n'
    for (ii = 0; ii < max; ii++) {
        if (oneResponse) {
            output += "Number ${ii} \n"
        } else {
            println "Number ${ii}"
        }
    }
    if (oneResponse) {
        println "${output}"
    } 
}
