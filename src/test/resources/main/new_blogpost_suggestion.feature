Feature: A new blogpost suggestion can be created

    Scenario: creation is successful with valid title, author, url and type
        Given command "Lisää" is selected
        When title "Consistency models", author "Nicola Apicella" and url "https://dev.to/napicellatwit/consistency-models-52l" and type "blogi" are entered
        Then system will respond with "Lukuvinkki lisätty!"
