/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.springframework.social.instagram.api.impl.response;

import org.springframework.social.instagram.api.impl.Comment;

/**
 *
 * @author Cornelius M
 */
public class CommentResponse {
    private Comment data;
    
    public CommentResponse(){
        
    }

    public Comment getData() {
        return data;
    }

    public void setData(Comment data) {
        this.data = data;
    }
    
    
}
