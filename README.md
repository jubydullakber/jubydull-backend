
## Help needed!

We want to create an REST API for invoicing. But so far we have only got a rough API draft and some pseudo code.

Most of our services are built using Spring Boot and Kotlin. So [spring initializr](https://start.spring.io/) might be a
good starting point to bootstrap the initial setup.

Note: It is recommended to use an in-memory database, after all this is just an assessment.

### Features

1. Create an invoice
    - Input: `InvoiceInput`
    - Output: `Invoice`
2. Get an invoice by its ID
    - Output: `Invoice`
3. Get the total amount of the current month by customer ID
    - Output: `Float`

### Type definitions

Our colleague drafted the following type definitions. As he did not know what technology we might use in the end these
are pseudo code. He told us though that properties marked with an exclamation mark (`!`) are required.

```
type Customer {
    id: UUID!
    name: String!
    address: String!
}

type Invoice {
    id: UUID!
    code: String! // human readable invoice code/number
    title: String!
    description: String
    issuedAt: String! // ISO date time
    customer: Customer!
    positions: [InvoicePosition!]!
    totalAmount: Float!
}

type InvoicePosition {
    description: String!
    amount: Float!
}

type InvoicePositionInput {
    description: String!
    amount: Float!
}

type InvoiceInput {
    title: String!
    description: String
    customerId: UUID!
    positions: [InvoicePositionInput!]!
}
```

