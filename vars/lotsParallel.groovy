def build_tasks = [:]
def call(max = 110) {

for (ii = 0; ii < max; ii++) {
        build_tasks["parallel-${ii}"] = {
          println "Number ${ii}"
        }
    }   
}

parallel build_tasks
