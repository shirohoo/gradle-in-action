# Gradle Task

```groovy
// 그레이들은 모든 처리를 태스크 단위로 처리한다
// 태스크는 어떤 처리를 진행하는 함수다
// 반드시 빌드에 관련된것만 정의하지 않아도 된다
// 태스크는 액션으로 이루어져있다
task hello {
    // 태스크에서 마지막에 처리되는 액션을 정의할 때 사용하는 내장 함수
    doLast {
        println 'doLast execute'
    }
    // 태스크에서 처음 처리되는 액션을 정의할 때 사용하는 내장 함수
    doFirst {
        println 'doFirst execute'
    }

    // 실행 결과
    // doFirst execute
    // doLast execute
}

// gradle -q -Pnum=100 total
task total {
    doLast {
        def total = 0

        // -Pnum으로 넘긴 값이 num에 매핑된다
        // 0부터 파라미터로 넘긴 값까지의 총합을 반환
        for (def i in 0..num.toInteger()) {
            total += i
        }
        println "total = $total"
    }

    // 실행 결과
    // total = 5050
}

// 동적 태스크를 생성하는 방법
// one, two, three, four, five 다섯개의 태스크가 동적으로 생성된다
// gradle -q one
[
        'one',
        'two',
        'three',
        'four',
        'five'
].each {
    task "$it" {
        println "this is a $it task."
    }
}
```
