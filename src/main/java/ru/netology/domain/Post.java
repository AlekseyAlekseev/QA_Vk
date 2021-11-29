package ru.netology.domain;

public class Post {

    private int id; // идентификатор
    private String ownerNameUrl; // имя и вложенная ссылка на владельца поста
    private int date; // дата публикации поста
    private String text; // текст в посте
    private String[] imageUrl; // ссылка на картинку
    private ThreeDot threeDot;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;


    // + getters and setters



}
