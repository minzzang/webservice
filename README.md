# webservice
http://www.minjjang.com

개인 브랜딩, 개발 블로그를 목표로 한 웹 애플리케이션입니다.
현재는 개인 브랜딩 기능만 완성되었고 블로그 기능을 추가할 예정입니다.
AWS EC2에 배포하였으며 자세한 기술 스택은 아래를 참고해주세요.

# 기술 스택
### Client
- HTML
- CSS
- bootstrap
- JQuery

### server
- Spring Boot
- MySQL

# 개발 포인트
- OAuth2.0을 이용한 구글, 네이버 로그인 연동
- Travis를 이용하여 CI 구축 빌드, 테스트 자동화
- AWS EC2, S3, CodeDeploy를 이용하여 배포 자동화
- NginX를 이용한 무중단 배포
