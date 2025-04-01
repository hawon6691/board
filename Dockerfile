# 1. JDK 17이 포함된 이미지 사용
FROM eclipse-temurin:17-jdk

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. 빌드된 JAR 파일 복사 (Gradle 빌드 경로)
COPY build/libs/board-0.0.1-SNAPSHOT.jar app.jar

# 4. 컨테이너에서 실행할 명령어
CMD ["java", "-jar", "app.jar"]
