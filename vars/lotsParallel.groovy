def call(max = 110) {
parallel 
for (ii = 0; ii < max; ii++) {
        "parallel ${ii}": {
          println "Number ${ii}"
        },
    }   
}
