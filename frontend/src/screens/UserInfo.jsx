import { Checkbox } from "@mui/material";
import React from "react";
import ComAdd from "../assets/images/login/Add.png";
import ComDelete from "../assets/images/login/Delete.png";
import ProfilePicture from "../assets/images/common/user.png";
import ComputerAdd from "../assets/images/common/Computer_Add.png";
import { border, display } from "@mui/system";

export default function UserInfo() {
  return (
    <div>
      <div>회원정보 수정</div>
      <div>
        <img
          style={{ display: "block", margin: "auto" }}
          src={ProfilePicture}
          alt="이 곳에 프로필 사진이 들어갑니다"
        />
      </div>
      <div>닉네임</div>
      <div>
        <div>
          <input
            type="text"
            name="NickName"
            placeholder="한글, 대소문자, 숫자만 입력할 수 있습니다."
            style={{
              width: "25%",
              display: "inline",
              border: "none",
              paddingLeft: "5px",
              outline: "none",
              boxSizing: "border-box",
              margin: "0 auto",
              marginright: "10px",
            }}
          ></input>
          <button
            type="DuplicateCheck"
            style={{
              width: "5%",
              display: "inline",
              margin: "0 auto",
              border: "none",
              outline: "none",
              marginLeft: "-10px",
              boxSizing: "border-box",
              textAlign: "center",
              color: "#ffdidc",
            }}
          >
            중복 확인
          </button>
        </div>
        <div>
          <div>
            <p>내 컴퓨터</p>
            <img
              src={ComputerAdd}
              alt="견적을 맞춘 내 컴퓨터를 추가하려면 클릭"
              style={{ height: "25px", width: "25px" }}
            />
            추가
          </div>
          <div>
            <p>내 컴퓨터 #1</p>
            <button>
              <img
                src={ComAdd}
                alt="짜여진 견적을 추가하려면 클릭"
                style={{
                  height: "50px",
                  width: "50px",
                  display: "inline",
                  margin: "auto",
                  marginright: "5%",
                  border: "0 solid",
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
                  border: "0 solid",
                }}
              />
            </button>
          </div>
        </div>
        <div>
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
