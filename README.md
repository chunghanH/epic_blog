# epic_blog

EPIC_BLOG Rest API

文章列表
GET /api/articles  

文章內文
GET /api/articles/{id}  

新增文章
POST /api/articles  
request json
{
  "title": "xxx",
  "content": "xxx"
}

更新文章
PUT /api/articles/{id}  
request json
{
  "title": "xxx",
  "content": "xxx"
}  
p.s:更新可擇一

刪除文章
DELETE /api/articles/{id}  
request json
{
  "title": "",
  "content": ""
}
