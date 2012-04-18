// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import ca.savi.camel.model.AddVlanRequest;
import ca.savi.camel.model.AddVlanResponse;
import ca.savi.camel.model.GenericOperationRequest;
import ca.savi.camel.model.GenericOperationResponse;
import ca.savi.camel.model.GetImageRequest;
import ca.savi.camel.model.GetImageResponse;
import ca.savi.camel.model.GetParamRequest;
import ca.savi.camel.model.GetParamResponse;
import ca.savi.camel.model.GetRequest;
import ca.savi.camel.model.GetResponse;
import ca.savi.camel.model.InitRequest;
import ca.savi.camel.model.InitResponse;
import ca.savi.camel.model.ListRequest;
import ca.savi.camel.model.ListResponse;
import ca.savi.camel.model.ObjectFactory;
import ca.savi.camel.model.ProgramRequest;
import ca.savi.camel.model.ProgramResponse;
import ca.savi.camel.model.RebootRequest;
import ca.savi.camel.model.RebootResponse;
import ca.savi.camel.model.ReleaseRequest;
import ca.savi.camel.model.ReleaseResponse;
import ca.savi.camel.model.RemoveVlanRequest;
import ca.savi.camel.model.RemoveVlanResponse;
import ca.savi.camel.model.ResetRequest;
import ca.savi.camel.model.ResetResponse;
import ca.savi.camel.model.SaveImageRequest;
import ca.savi.camel.model.SaveImageResponse;
import ca.savi.camel.model.SetParamRequest;
import ca.savi.camel.model.SetParamResponse;
import ca.savi.camel.model.StatusRequest;
import ca.savi.camel.model.StatusResponse;
import ca.savi.camel.model.TerminateRequest;
import ca.savi.camel.model.TerminateResponse;

/**
 * Processing resource port.
 * @author Eliot J. Kang <eliot@savinetwork.ca>
 * @version 0.1
 */
@WebService(
    name = "AORResourceService",
    targetNamespace = "http://camel.savi.ca/wsdl/AORResource")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface AORResourceService {
  /**
   * Get a resource.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.GetResponse
   */
  @WebMethod(operationName = "AORResourceGet")
  @WebResult(name = "getResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public GetResponse aorResourceGet(@WebParam(name = "getRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") GetRequest inputPart);

  /**
   * Release a resource.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.ReleaseResponse
   */
  @WebMethod(operationName = "AORResourceRelease")
  @WebResult(name = "releaseResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public ReleaseResponse aorResourceRelease(@WebParam(name = "releaseRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") ReleaseRequest inputPart);

  /**
   * Get a status of a resource.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.StatusResponse
   */
  @WebMethod(operationName = "AORResourceStatus")
  @WebResult(name = "statusResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public StatusResponse aorResourceStatus(@WebParam(name = "statusRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") StatusRequest inputPart);

  /**
   * Program a resource.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.ProgramResponse
   */
  @WebMethod(operationName = "AORResourceProgram")
  @WebResult(name = "programResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public ProgramResponse aorResourceProgram(@WebParam(name = "programRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") ProgramRequest inputPart);

  /**
   * Initialize a resource.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.InitResponse
   */
  @WebMethod(operationName = "AORResourceInit")
  @WebResult(name = "initResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public InitResponse aorResourceInit(@WebParam(name = "initRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") InitRequest inputPart);

  /**
   * Save an image
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.SaveImageResponse
   */
  @WebMethod(operationName = "AORResourceSaveImage")
  @WebResult(name = "saveImageResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public SaveImageResponse aorResourceSaveImage(@WebParam(
      name = "saveImageRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") SaveImageRequest inputPart);

  /**
   * Get an image of a resource.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.GetImageResponse
   */
  @WebMethod(operationName = "AORResourceGetImage")
  @WebResult(name = "getImageResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public GetImageResponse aorResourceGetImage(@WebParam(
      name = "getImageRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") GetImageRequest inputPart);

  /**
   * Reset a resource.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.ResetResponse
   */
  @WebMethod(operationName = "AORResourceReset")
  @WebResult(name = "resetResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public ResetResponse aorResourceReset(@WebParam(name = "resetRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") ResetRequest inputPart);

  /**
   * Set a parameter.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.SetParamResponse
   */
  @WebMethod(operationName = "AORResourceSetParam")
  @WebResult(name = "setParamResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public SetParamResponse aorResourceSetParam(@WebParam(
      name = "setParamRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") SetParamRequest inputPart);

  /**
   * Get a parameter.
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.GetParamResponse
   */
  @WebMethod(operationName = "AORResourceGetParam")
  @WebResult(name = "getParamResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public GetParamResponse aorResourceGetParam(@WebParam(
      name = "getParamRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") GetParamRequest inputPart);

  /**
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.AddVlanResponse
   */
  @WebMethod(operationName = "AORResourceAddVlan")
  @WebResult(name = "addVlanResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public AddVlanResponse aorResourceAddVlan(@WebParam(name = "addVlanRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") AddVlanRequest inputPart);

  /**
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.RemoveVlanResponse
   */
  @WebMethod(operationName = "AORResourceRemoveVlan")
  @WebResult(name = "removeVlanResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public RemoveVlanResponse aorResourceRemoveVlan(@WebParam(
      name = "removeVlanRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") RemoveVlanRequest inputPart);

  /**
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.RebootResponse
   */
  @WebMethod(operationName = "AORResourceReboot")
  @WebResult(name = "rebootResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public RebootResponse aorResourceReboot(@WebParam(name = "rebootRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") RebootRequest inputPart);

  /**
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.TerminateResponse
   */
  @WebMethod(operationName = "AORResourceTerminate")
  @WebResult(name = "terminateResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public TerminateResponse aorResourceTerminate(@WebParam(
      name = "terminateRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") TerminateRequest inputPart);

  /**
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.ListResponse
   */
  @WebMethod(operationName = "AORResourceList")
  @WebResult(name = "listResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public ListResponse aorResourceList(@WebParam(name = "listRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") ListRequest inputPart);

  /**
   * @param inputPart
   * @return returns ca.savi.ws.resourcemanager.GenericOperationResponse
   */
  @WebMethod(operationName = "AORResourceGenericOperation")
  @WebResult(name = "genericOperationResponse",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "OutputPart")
  public GenericOperationResponse aorResourceGenericOperation(@WebParam(
      name = "genericOperationRequest",
      targetNamespace = "http://camel.savi.ca/model/AORResourceSchema",
      partName = "InputPart") GenericOperationRequest inputPart);
}
