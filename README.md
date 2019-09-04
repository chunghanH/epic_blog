# epic_blog

EPIC_BLOG Rest API

文章列表
GET /api/posts  

文章內文
GET /api/posts/{id}

新增文章
POST /api/posts  
request json
{
  "title": "xxx",
  "content": "xxx"
}

更新文章
PATCH /api/posts/{id}  
request json
{
  "title": "xxx",
  "content": "xxx"
}  

刪除文章
DELETE /api/posts/{id}  

