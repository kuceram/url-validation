package url.validation

class Company {

    String name

    String websiteUrl

    String intranetUrl

    static constraints = {
        websiteUrl url: true
        intranetUrl url: true
    }
}
