package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should check fraud status"
    request {
        url "/check"
        method GET()
    }
    response {
        status 200
        body(
            fraud: true,
            message: "Stolen Card"
        )
    }
}