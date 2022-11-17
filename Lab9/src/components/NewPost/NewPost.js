import axios from "axios";
import React,  {useRef, useState } from "react";

import "./NewPost.css";

const NewPost = (props) => {
  const postForm = useRef();
  const [post, setPost] = useState({
    title: "",
    content: "",
    author: "",
  });

  const addPostHandeler = () => {
    const form = postForm.current;
    const data = {
      title: form["title"].value,
    content: form["content"].value,
    author: form["author"].value,
    };
    console.log(data);
   axios
      .post("http://localhost:8080/api/v1/posts", post)
      .then((data) => {
        props.execute();
        console.log("success", data);
      })
      .catch((error) => console.log(error.message));
  };
  console.log("Added");
  return (
    <div className="NewPost">
      <h1>Add a Post</h1>
       <form ref = {postForm}> 
      
        <label>Title</label>
        <input
          type="text"
          value={post.title}
          onChange={(event) => setPost({ ...post, title: event.target.value })}
        />
        <label>Content</label>
        <textarea
          rows="4"
          value={post.content}
          onChange={(event) =>
            setPost({ ...post, content: event.target.value })
          }
        />
        <label>Author</label>
        <select
          value={post.author}
          onChange={(event) => setPost({ ...post, author: event.target.value })}
        >
          <option value="James" defaultValue>
            James
          </option>
          <option value="Sara">Sara</option>
          <option value="Daniel">Daniel</option>
        </select>
        <button onClick={addPostHandeler}>Add Post</button>
      </form>
    </div>
  );
};

export default NewPost;
