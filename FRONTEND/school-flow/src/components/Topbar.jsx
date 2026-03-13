import { FaSearch, FaUser } from "react-icons/fa"

import "../styles/topbar.css"

export default function Topbar(){

return(

<div className="topbar">

<div className="search">

<FaSearch/>

<input placeholder="Search students, teachers, courses..."/>

<select>

<option>All</option>
<option>Students</option>
<option>Teachers</option>
<option>Courses</option>

</select>

</div>

<div>

<button className="login-btn">

<FaUser/> Login

</button>

</div>

</div>

)

}