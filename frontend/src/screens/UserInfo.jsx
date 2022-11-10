import { Box, Checkbox } from "@mui/material";
import React from "react";
import ComAdd from "../assets/images/login/Add.png";
import ComDelete from "../assets/images/login/Delete.png";
import ProfilePicture from "../assets/images/common/user.png";
import ComputerAdd from "../assets/images/common/Computer_Add.png";
import { border, display } from "@mui/system";

export default function UserInfo() {
  return (
    <div align="center">
      <div
        style={{
          borderStyle: "solid",
          borderColor: "#ffffff",
          borderWidth: "100px",
          borderBottomWidth: "50px",
        }}
      >
        <p style={{ fontSize: "40px", fontWeight: "bold" }}>회원정보 수정</p>
      </div>
      <div
        style={{
          borderBottomWidth: "100px",
        }}
      >
        <img
          width="300px"
          height="300px"
          border={{ width: "50px", color: "white", style: "solid" }}
          src={ProfilePicture}
          alt="이 곳에 프로필 사진이 들어갑니다"
        />
      </div>
      <div>
        <br />
        <p style={{ fontWeight: "bold" }}>닉네임</p>
        <br />
        <p>닉네임은 최대 한글 6자까지 입력할 수 있습니다.</p>
        <input
          type="text"
          name="NickName"
          maxLength="6"
          placeholder="닉네임을 입력해주세요."
          style={{
            width: "500px",
            height: "50px",
            display: "inline",
            border: "0",
            paddingLeft: "5px",
            outline: "none",
            boxSizing: "border-box",
            margin: "0 auto",
            marginright: "10px",
            fontSize: "40px",
          }}
        ></input>
        <button
          type="DuplicateCheck"
          style={{
            width: "80px",
            height: "50px",
            display: "inline",
            margin: "0 auto",
            border: "none",
            outline: "none",
            marginLeft: "-10px",
            boxSizing: "border-box",
            textAlign: "center",
            color: "#023047",
          }}
        >
          중복 확인
        </button>
        <div style={{ borderWidth: "100px" }}>
          <p
            style={{
              display: "inline",
            }}
          >
            내 컴퓨터
          </p>
          <button style={{ display: "inline" }}>
            <img
              src={ComputerAdd}
              alt="견적을 맞춘 내 컴퓨터를 추가하려면 클릭"
              style={{ height: "25px", width: "25px" }}
            />
          </button>
          <p style={{ display: "inline" }}></p>
          <button>
            <img
              src={ComAdd}
              alt="짜여진 견적을 추가하려면 클릭"
              style={{
                height: "50px",
                width: "50px",
                display: "inline",
                margin: "auto",
                borderRadius: "20px",
                border: "solid",
                borderColor: "#ffffff",
              }}
            />
          </button>
          <button>
            <img
              src={ComDelete}
              alt="짜여진 견적을 삭제하려면 클릭"
              style={{
                height: "50px",
                width: "50px",
                display: "inline",
                margin: "auto",
                borderRadius: "20px",
                border: "solid",
                borderColor: "#ffffff",
              }}
            />
          </button>
        </div>
        <div
          style={{
            borderStyle: "solid",
            borderWidth: "50px",
            borderColor: "#ffffff",
          }}
        >
          <button
            type="EditComplete"
            style={{
              width: "200px",
              height: "50px",
              display: "block",
              margin: "auto",
              textAlign: "center",
              borderRadius: "10px",
            }}
          >
            수정 완료
          </button>
        </div>
      </div>
    </div>
  );
}
