import React from 'react';
import { Navbar,Container,Nav,Dropdown,Modal,Button,Form,Table,Row,Col } from 'react-bootstrap';

const Enrolledcourse = ({props}) =>{
    console.log(props);
    return(
        <>
            <div id="enrolledCourse" class="mh-100  col-3 mt-5 d-inline-block bg-info">
                <Row>
                    <Col><lable>Course name:</lable></Col>
                    <Col><lable>{props.name}</lable><br/></Col>
                </Row>
                <Row>
                    <Col><lable>Joined Date: </lable></Col>
                    <Col><lable>{props.jdate}</lable><br/></Col>
                </Row>
                <Row>
                    <Col><lable>Course end date:</lable></Col>
                    <Col><lable>{props.edate}</lable><br/></Col>
                </Row>
            </div>
        </>
    )
}

export default Enrolledcourse;