import React, { useRef, useState } from 'react'
import { Navbar,Container,Nav,Dropdown,Modal,Button,Form,Table,Row,Col } from 'react-bootstrap';

const Admincourse = () =>{
    const searchInput = useRef();
    const courseName = useRef();
    const courseDuration = useRef();
    const courseTiming = useRef();
    const courseEnrolled = useRef();
    const courseDescription = useRef();
    
    const [showAddPopUp,setShowAddPopUp] = useState(false);

    const handleSearch = ()=>{
        console.log(searchInput.current.value);
    }
    const handleAdd = ()=>{
        const courseNameV = courseName.current.value;
        setShowAddPopUp(!showAddPopUp) 
    }
    
    return (
        <>
            {
                showAddPopUp?
                <>
                    <div class="container col-5 p-5 mt-5 border-dark  bg-warning  position-absolute" style={{top:100,left:448}}>
                    <input type="text" id="courseName" ref={courseName} class="col-3 form-control " placeholder="Type here to search course" /><br/>
                    <input type="text" id="courseDuration" ref={courseDuration} class="col-3 form-control " placeholder="Type here to search course" /><br/>
                    <input type="text" id="courseTiming" ref={courseTiming} class="col-3 form-control " placeholder="Type here to search course" /><br/>
                    <input type="text" id="courseEnrolled" ref={courseEnrolled} class="col-3 form-control " placeholder="Type here to search course" /><br/>
                    <input type="text" id="courseDescription" ref={courseDescription} class="col-3 form-control " placeholder="Type here to search course" /><br/>
                    <button type="button" id="login_btn" class="btn btn-secondary" onClick={handleAdd}>Add</button><br/>
                   
                    </div>
                </>
                :null
            }
            <div class = "container col-3 mt-5 ">
                <input type="text" id="searchInput" ref={searchInput} class="col-3 form-control " placeholder="Type here to search course" /><br/>
                <button type="button" id="searchCourse" class="btn btn-success" onClick={handleSearch}>Search</button>&nbsp;&nbsp;&nbsp;&nbsp;
                <button type="button" id="login_btn" class="btn btn-secondary" onClick={()=>{setShowAddPopUp(!showAddPopUp)}} >Add</button><br/>
            </div>
            <div class = "container  bg-info col-5 mt-5  mb-5 p-3">
                <Row>
                    <Col><label> Course Name</label></Col>
                    <Col><label> Some Name</label></Col>
                    <Col></Col>
                    <Col><label> Number of Students</label></Col>
                    <Col><label> 50</label></Col>
                    <Col></Col>
                </Row>
                
                <Row>
                    <Col><label> Course Duration</label></Col>
                    <Col><label> 3 months</label></Col>
                    <Col></Col>
                    <Col><label> Course Description</label></Col>
                    <Col><label> YYYYYY</label></Col>
                    <Col></Col>
                </Row>

                <Row>
                    <Col><label> Course Available Timings</label></Col>
                    <Col><label> 6AM to 6PM</label></Col>
                    <Col></Col>
                    <Col>
                        <button type="button" class="btn btn-primary" aria-label="Left Align">
                            edit
                        </button>
                    </Col>
                    <Col>
                        <button type="button" class="btn btn-danger" aria-label="Left Align">
                            delete
                        </button>
                    </Col>
                    <Col></Col>
                </Row>
            </div>
            
        </>
    )
}

export default Admincourse;