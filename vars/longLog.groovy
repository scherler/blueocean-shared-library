def call(max) {
    def output
    for (ii = 0; ii < max; ii++) {
        output << "Number ${ii}" << '\n'
    }
    println "${output}"
}
