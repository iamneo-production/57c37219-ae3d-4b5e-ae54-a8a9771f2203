import React,{useState} from 'react';
import { Navbar,Container,Nav,Dropdown,Modal,Button,Form,Table,Row,Col } from 'react-bootstrap';
import Enrolledcourse from "./Enrolledcourse";

const ViewAcademy = () =>{
    const [viewCourse,setViewCourse] = useState(false);
    const [allCourses,setAllCourses] = useState([]);
    const course = {
        name:"mahii"
    }
    return (
        <>
            <Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
                    <Container fluid>
                        <Navbar.Brand href="/viewacademy">Abacus academy<a href="/"></a></Navbar.Brand>
                        <Navbar.Toggle aria-controls="navbarScroll" />
                        <Navbar.Collapse id="navbarScroll">
                        <Nav
                            className="me-auto my-2 my-lg-0"
                            style={{ maxHeight: '100px' }}
                            navbarScroll
                        >

                            {/* <Nav.Link onClick={()=>{setShowCustomerAddModal(true)}}>Add Customer</Nav.Link>
                            <Nav.Link onClick={()=>{setShowCustomerTable(!showCustomerTable)}}>View Customer</Nav.Link> 
                            <Nav.Link onClick={handleRefresh}>Refresh</Nav.Link>*/}
                            <Nav.Link id="userAcademy" style={{ paddingLeft: '300px' }}>Academy</Nav.Link> 
                            <Nav.Link id="userEnrolledCourse" onClick={()=>{
                                
                                setViewCourse(!viewCourse);
                            }} style={{ paddingLeft: '250px' }}>Enrolled course</Nav.Link> 
                            <Nav.Link id = "logout" style={{ paddingLeft: '500px' }}>Logout</Nav.Link> 
                        </Nav>
                         </Navbar.Collapse>
                    </Container>
                </Navbar>
            {
                viewCourse?
                <>
                    <Enrolledcourse props={course}/>
                </>:
                null
            }
        </>
    )
}
export default ViewAcademy;