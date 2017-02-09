def call(max) {
    def output  = 'HERE goes NOTHING\n'
    for (ii = 0; ii < max; ii++) {
        output << "Number ${ii}" << '\n'
    }
    println "${output}"
}
