// Copyright (C) 2012, The SAVI Project.
package ca.savi.camel.service;

import javax.jws.WebService;

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
@WebService(serviceName = "NodeResourceService",
    portName = "NodeResourcePortTypeBindingPort",
    endpointInterface = "ca.savi.camel.service.NodeResourcePortType",
    targetNamespace = "http://camel.savi.ca/NodeResource")
public class NodeResourceService
    implements NodeResourcePortType {
  @Override
  public GetResponse nodeResourceGet(GetRequest inputPart) {
    GetResponse out = new GetResponse();
    out.setSuccessful(true);
    out.setError("Get generic resource");
    return out;
  }

  @Override
  public ReleaseResponse nodeResourceRelease(ReleaseRequest inputPart) {
    ReleaseResponse out = new ReleaseResponse();
    out.setSuccessful(true);
    out.setError("Release generic resource");
    return out;
  }

  @Override
  public StatusResponse nodeResourceStatus(StatusRequest inputPart) {
    StatusResponse out = new StatusResponse();
    out.setSuccessful(true);
    out.setError("Status generic resource");
    return out;
  }

  @Override
  public ProgramResponse nodeResourceProgram(ProgramRequest inputPart) {
    ProgramResponse out = new ProgramResponse();
    out.setSuccessful(true);
    out.setError("Program generic resource");
    return out;
  }

  @Override
  public InitResponse nodeResourceInit(InitRequest inputPart) {
    InitResponse out = new InitResponse();
    out.setSuccessful(true);
    out.setError("Init generic resource");
    return out;
  }

  @Override
  public SaveImageResponse nodeResourceSaveImage(SaveImageRequest inputPart) {
    SaveImageResponse out = new SaveImageResponse();
    out.setSuccessful(true);
    out.setError("Save image generic resource");
    return out;
  }

  @Override
  public GetImageResponse nodeResourceGetImage(GetImageRequest inputPart) {
    GetImageResponse out = new GetImageResponse();
    out.setSuccessful(true);
    out.setError("Get image generic resource");
    return out;
  }

  @Override
  public ResetResponse nodeResourceReset(ResetRequest inputPart) {
    ResetResponse out = new ResetResponse();
    out.setSuccessful(true);
    out.setError("Reset generic resource");
    return out;
  }

  @Override
  public SetParamResponse nodeResourceSetParam(SetParamRequest inputPart) {
    SetParamResponse out = new SetParamResponse();
    out.setSuccessful(true);
    out.setError("Set param generic resource");
    return out;
  }

  @Override
  public GetParamResponse nodeResourceGetParam(GetParamRequest inputPart) {
    GetParamResponse out = new GetParamResponse();
    out.setSuccessful(true);
    out.setError("Get param generic resource");
    return out;
  }

  @Override
  public RebootResponse nodeResourceReboot(RebootRequest inputPart) {
    RebootResponse out = new RebootResponse();
    out.setSuccessful(true);
    out.setError("Reboot generic resource");
    return out;
  }

  @Override
  public TerminateResponse nodeResourceTerminate(TerminateRequest inputPart) {
    TerminateResponse out = new TerminateResponse();
    out.setSuccessful(true);
    out.setError("Terminate generic resource");
    return out;
  }

  @Override
  public ListResponse nodeResourceList(ListRequest inputPart) {
    ListResponse listOut = new ListResponse();
    listOut.setSuccessful(true);
    listOut.setError("List generic resource");
    return listOut;
  }

  @Override
  public GenericOperationResponse nodeResourceGenericOperation(
      GenericOperationRequest inputPart) {
    GenericOperationResponse out = new GenericOperationResponse();
    out.setXmlString("<xml></xml>");
    return out;
  }
}
