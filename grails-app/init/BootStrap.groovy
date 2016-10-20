import url.validation.Company

class BootStrap {

    def init = { servletContext ->
        def bata = new Company(name: "Baťa", websiteUrl: "https://www.bata.com:80", intranetUrl: "http://localhost:80")
        bata.save(failOnError: true)
    }
    def destroy = {
    }
}
