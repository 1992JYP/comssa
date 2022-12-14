import "./Parallax.scss";

import { useEffect, useState } from "react";

export default function Parallax(){
    const [position, setPosition] = useState(0);
    const [resize, setResize] = useState();

    const onScroll = () => {
        setPosition(window.scrollY);
    }

    const handleResize = () => {
        setResize(window.innerWidth);
    }

    useEffect(() => {
        window.addEventListener("scroll", onScroll);
        return () => {
            window.removeEventListener("scroll", onScroll);
        }
    }, []);

    useEffect(() => {
        window.addEventListener("resize", handleResize);
        return () => {
            window.removeEventListener("resize", handleResize);
        };
    }, []);

    // position scroll y축
    // resize 화면의 x 크기

    return (
        <div className="flex center">
        <div className="posrel roBold fs-60 pt-15 pb-15"
        >
            <p
        className="para"
        style={{
            transform: `translateX(${(position*0.05)}vw)`,
        }}
        >
            Recommend
        </p>
        </div>

        <div className="posflex roBold fs-60 pt-15 pb-15"
        >
            <p
        className="para"
        style={{
            transform: `translateX(${1-position*0.05}vw)`,
        }}
        >
            Compare
        </p>
        </div>

        <div className="br-125 cardwrap pos1"
        style={{
            transform: `translateX(${position*0.01-1}vw)`,
        }}
        >
            
        </div>

        <div className="br-125 cardwrap pos2"
        style={{
            transform: `translateX(${1-position*0.01}vw)`,
        }}
        >
            
        </div>
        </div>
    )
}