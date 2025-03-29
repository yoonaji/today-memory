docker run -it -e POSTGRES_DB=mydb -e POSTGRES_USER=yoona -e POSTGRES_PASSWORD=0000 7f29c02ba9ee /bin/bash
docker run -d   --name pg-container   -e POSTGRES_DB=mydb   -e POSTGRES_USER=yoona   -e POSTGRES_PASSWORD=0000   -p 5432:5432   postgres:latest
