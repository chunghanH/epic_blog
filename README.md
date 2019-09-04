# epic_blog

EPIC_BLOG Rest API

文章列表
GET /blog/api/posts  

文章內文
GET /blog/api/posts/{id}

新增文章
POST /blog/api/posts  
request json
{
  "title": "xxx",
  "content": "xxx"
}

更新文章
PATCH /blog/api/posts/{id}  
request json
{
  "title": "xxx",
  "content": "xxx"
}  

刪除文章
DELETE /blog/api/posts/{id}  

