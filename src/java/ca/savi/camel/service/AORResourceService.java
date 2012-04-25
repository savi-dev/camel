// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

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
 * A Web service implementation for a general resource.
 * @author Eliot J. Kang <eliot@savinetwork.ca>
 * @version
 */
@WebService(
    name = "AORResourceService",
    targetNamespace = "http://camel.savi.ca/wsdl/AORResource")
public class AORResourceService implements AORResourcePortType {
  @Override
  public GetResponse aorResourceGet(GetRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ReleaseResponse aorResourceRelease(ReleaseRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public StatusResponse aorResourceStatus(StatusRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ProgramResponse aorResourceProgram(ProgramRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InitResponse aorResourceInit(InitRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SaveImageResponse aorResourceSaveImage(SaveImageRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GetImageResponse aorResourceGetImage(GetImageRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ResetResponse aorResourceReset(ResetRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SetParamResponse aorResourceSetParam(SetParamRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GetParamResponse aorResourceGetParam(GetParamRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public AddVlanResponse aorResourceAddVlan(AddVlanRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RemoveVlanResponse aorResourceRemoveVlan(RemoveVlanRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RebootResponse aorResourceReboot(RebootRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public TerminateResponse aorResourceTerminate(TerminateRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ListResponse aorResourceList(ListRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GenericOperationResponse aorResourceGenericOperation(
      GenericOperationRequest inputPart) {
    // TODO Auto-generated method stub
    return null;
  }
}
