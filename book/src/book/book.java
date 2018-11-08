package book;

public class book {
	 // поля класса
	private int id ;
	private String name;
	private String autor;
	private String publisher;
	private Integer yearOfRelease;
	private Integer page;
	private Integer cost;
	private String coverType;

    // конструктор
	public book(int id, String name, String autor, String publisher, 
			Integer yearOfRelease, Integer page, Integer cost,String coverType) {
		
		this.id = id;
        this.name = name;
        this.autor = autor;
        this.publisher = publisher;
        this.yearOfRelease = yearOfRelease;
        this.page = page;
        this.cost = cost;
        this.coverType = coverType;
	}  
     
	
	// геттеры и сеттеры 
	public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }


    public String getPublisher() {

        return publisher;
    }

    public int getPage() {
        return page;
    }

    public int getCost() {
        return cost;
    }

    public String getCoverType() {
        return coverType;
    }

	public int setId() {
        return id;
    }

    public String setName() {
        return name;
    }

    public String setAutor() {
        return autor;
    }

    public int setYearOfRelease() {
        return yearOfRelease;
    }


    public String setPublisher() {

        return publisher;
    }

    public int setPage() {
        return page;
    }

    public int setCost() {
        return cost;
    }

    public String setCoverType() {
        return coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", page=" + page +
                ", cost=" + cost +
                ", coverType='" + coverType + '\'' +
                '}';
    }  
	}

	
	


